package org.mule.modules.guidewirepoc.pocuploadservice;

public class PocUploadInput {
	private String claimNumber;
	private String fileDescription;
	private String filename;
	private byte[] imageBytes;
	
	public String getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}
	public String getFileDescription() {
		return fileDescription;
	}
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public byte[] getImageBytes() {
		return imageBytes;
	}
	public void setImageBytes(byte[] imageBytes) {
		this.imageBytes = imageBytes;
	}
	public String toString() {
		return getClass().getName() + "@{claimNumber: "+claimNumber+",filename: "+filename+",fileDescription: "+fileDescription+",imageBytes.length: "+(imageBytes == null ? "null" : imageBytes.length)+"}";
	}
}
