package br.com.robustech.face.reconhecimento;

import org.bytedeco.javacpp.opencv_face.FaceRecognizer;
import static org.bytedeco.javacpp.opencv_face.createEigenFaceRecognizer;

public class TesteJavaCV {

	public static void main(String[] args) {

		FaceRecognizer r = createEigenFaceRecognizer();
	   
	}

}
