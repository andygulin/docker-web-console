package docker.web.console.service;

import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.api.model.Version;
import docker.web.console.bean.ImageVO;
import docker.web.console.bean.SearchItemVO;

import java.util.List;

public interface DockerMgrService {

    Info getInfo();

    Version getVersion();

    List<ImageVO> getImages();

    List<SearchItemVO> searchImages(String term);

    void removeImage(String imageId) throws Exception;

    void pullImage(String repository);
}
