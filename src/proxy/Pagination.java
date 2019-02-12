package proxy;
import javax.servlet.http.HttpServletRequest;

import command.Receiver;
import lombok.Data;
import service.CustomerServiceImpl;

@Data
public class Pagination implements Capable{
	
	private String pageNum, pageSize, blockSize,
			startRow, endRow, startPage, endPage,
			prevBlock, nextBlock;
	private int totalCount;
	private boolean existPrev, existNext;
	@Override
	public void carryOut() {
		HttpServletRequest request = Receiver.cmd.getRequest();
		this.pageNum = (request.getParameter("page_num")==null)?"1":request.getParameter("page_num");
		this.pageSize = (request.getParameter("page_size")==null)?"5":request.getParameter("page_size");
		
		/*String pageSize = request.getParameter("page_size");
		
				
		this.totalCount = CustomerServiceImpl.getInstance().countCustomer();*/
		
		this.startRow = "1";
		this.endRow = "5";
	}
}
