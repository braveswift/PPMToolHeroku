package yanhong.ppmtool.exceptions;

public class ProjectIdExceptionResponse {

    private String exceptionMessage;

    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.exceptionMessage = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return exceptionMessage;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.exceptionMessage = projectIdentifier;
    }
}
