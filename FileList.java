package InterviewPrograms;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileList {
	private int size = 300;
	
	private void FindFiles(String path, List<String> result) {
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		for(int i=0; i<listOfFiles.length; i++) {
			if(listOfFiles[i].isFile()) {
				if(listOfFiles[i].length() > size) {
					result.add(listOfFiles[i].getName());
				}
			}else if(listOfFiles[i].isDirectory()) {
				FindFiles(path + "/" + listOfFiles[i].getName(),result);
			}
		}
	}
	
	public static void main(String[] args) {
		String inputPath = "/Users/sarmistha/Documents/Sarmistha/JavaProgram";
		List<String> result = new ArrayList<String>();
		FileList fl = new FileList();
		fl.FindFiles(inputPath, result);
		for(int i=0; i< result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
