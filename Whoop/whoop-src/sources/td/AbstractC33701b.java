package td;

import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p146fe.C14409a;
import p146fe.C14410b;
import wb3.AbstractC37056f;
import yb3.C39412p;

/* JADX INFO: renamed from: td.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC33701b {

    /* JADX INFO: renamed from: a */
    public static final List f140889a;

    static {
        C39412p c39412p = new C39412p("^(us|eu|ap|sa|ca|me|af|il|mx)\\-\\w+\\-\\d+$");
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("af-south-1", new C14410b()), new C23465k("ap-east-1", new C14410b()), new C23465k("ap-east-2", new C14410b()), new C23465k("ap-northeast-1", new C14410b()), new C23465k("ap-northeast-2", new C14410b()), new C23465k("ap-northeast-3", new C14410b()), new C23465k("ap-south-1", new C14410b()), new C23465k("ap-south-2", new C14410b()), new C23465k("ap-southeast-1", new C14410b()), new C23465k("ap-southeast-2", new C14410b()), new C23465k("ap-southeast-3", new C14410b()), new C23465k("ap-southeast-4", new C14410b()), new C23465k("ap-southeast-5", new C14410b()), new C23465k("ap-southeast-6", new C14410b()), new C23465k("ap-southeast-7", new C14410b()), new C23465k("aws-global", new C14410b()), new C23465k("ca-central-1", new C14410b()), new C23465k("ca-west-1", new C14410b()), new C23465k("eu-central-1", new C14410b()), new C23465k("eu-central-2", new C14410b()), new C23465k("eu-north-1", new C14410b()), new C23465k("eu-south-1", new C14410b()), new C23465k("eu-south-2", new C14410b()), new C23465k("eu-west-1", new C14410b()), new C23465k("eu-west-2", new C14410b()), new C23465k("eu-west-3", new C14410b()), new C23465k("il-central-1", new C14410b()), new C23465k("me-central-1", new C14410b()), new C23465k("me-south-1", new C14410b()), new C23465k("mx-central-1", new C14410b()), new C23465k("sa-east-1", new C14410b()), new C23465k("us-east-1", new C14410b()), new C23465k("us-east-2", new C14410b()), new C23465k("us-west-1", new C14410b()), new C23465k("us-west-2", new C14410b()));
        Boolean bool = Boolean.TRUE;
        f140889a = AbstractC37056f.m118959K(new C14409a("aws", mapM73990Y, c39412p, new C14410b("aws", "amazonaws.com", "api.aws", bool, bool, "us-east-1")), new C14409a("aws-cn", AbstractC25247g0.m73990Y(new C23465k("aws-cn-global", new C14410b()), new C23465k("cn-north-1", new C14410b()), new C23465k("cn-northwest-1", new C14410b())), new C39412p("^cn\\-\\w+\\-\\d+$"), new C14410b("aws-cn", "amazonaws.com.cn", "api.amazonwebservices.com.cn", bool, bool, "cn-northwest-1")), new C14409a("aws-eusc", AbstractC25247g0.m73989X(new C23465k("eusc-de-east-1", new C14410b())), new C39412p("^eusc\\-(de)\\-\\w+\\-\\d+$"), new C14410b("aws-eusc", "amazonaws.eu", "api.amazonwebservices.eu", bool, bool, "eusc-de-east-1")), new C14409a("aws-iso", AbstractC25247g0.m73990Y(new C23465k("aws-iso-global", new C14410b()), new C23465k("us-iso-east-1", new C14410b()), new C23465k("us-iso-west-1", new C14410b())), new C39412p("^us\\-iso\\-\\w+\\-\\d+$"), new C14410b("aws-iso", "c2s.ic.gov", "api.aws.ic.gov", bool, bool, "us-iso-east-1")), new C14409a("aws-iso-b", AbstractC25247g0.m73990Y(new C23465k("aws-iso-b-global", new C14410b()), new C23465k("us-isob-east-1", new C14410b()), new C23465k("us-isob-west-1", new C14410b())), new C39412p("^us\\-isob\\-\\w+\\-\\d+$"), new C14410b("aws-iso-b", "sc2s.sgov.gov", "api.aws.scloud", bool, bool, "us-isob-east-1")), new C14409a("aws-iso-e", AbstractC25247g0.m73990Y(new C23465k("aws-iso-e-global", new C14410b()), new C23465k("eu-isoe-west-1", new C14410b())), new C39412p("^eu\\-isoe\\-\\w+\\-\\d+$"), new C14410b("aws-iso-e", "cloud.adc-e.uk", "api.cloud-aws.adc-e.uk", bool, bool, "eu-isoe-west-1")), new C14409a("aws-iso-f", AbstractC25247g0.m73990Y(new C23465k("aws-iso-f-global", new C14410b()), new C23465k("us-isof-east-1", new C14410b()), new C23465k("us-isof-south-1", new C14410b())), new C39412p("^us\\-isof\\-\\w+\\-\\d+$"), new C14410b("aws-iso-f", "csp.hci.ic.gov", "api.aws.hci.ic.gov", bool, bool, "us-isof-south-1")), new C14409a("aws-us-gov", AbstractC25247g0.m73990Y(new C23465k("aws-us-gov-global", new C14410b()), new C23465k("us-gov-east-1", new C14410b()), new C23465k("us-gov-west-1", new C14410b())), new C39412p("^us\\-gov\\-\\w+\\-\\d+$"), new C14410b("aws-us-gov", "amazonaws.com", "api.aws", bool, bool, "us-gov-west-1")));
    }
}
