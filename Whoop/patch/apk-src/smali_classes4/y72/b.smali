.class public final Ly72/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Ly72/b;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;",
        "response",
        "Lw72/d$c;",
        "c",
        "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;)Lw72/d$c;",
        "Lcom/whoop/design/models/items/BiomarkerModel;",
        "Lb01/c;",
        "d",
        "(Lcom/whoop/design/models/items/BiomarkerModel;)Lb01/c;",
        "Lec3/l;",
        "Lt72/b;",
        "upstream",
        "Lw72/d;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "sanguine_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ly72/b;Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;)Lw72/d$c;
    .locals 0

    invoke-direct {p0, p1}, Ly72/b;->c(Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;)Lw72/d$c;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;)Lw72/d$c;
    .locals 4

    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;->getPageHeader()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;->getSearchPlaceholder()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;->getBiomarkers()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/BiomarkerModel;

    invoke-direct {p0, v3}, Ly72/b;->d(Lcom/whoop/design/models/items/BiomarkerModel;)Lb01/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lb01/q;

    const-string v3, ""

    invoke-direct {p1, v3, v1, v2}, Lb01/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v1, Lw72/d$c;

    invoke-direct {v1, v0, p1}, Lw72/d$c;-><init>(Ljava/lang/String;Lb01/q;)V

    return-object v1
.end method

.method private final d(Lcom/whoop/design/models/items/BiomarkerModel;)Lb01/c;
    .locals 4

    new-instance v0, Lb01/c;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BiomarkerModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BiomarkerModel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BiomarkerModel;->getTrailingIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/design/models/items/BiomarkerModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly72/b$a;

    invoke-direct {v0, p1, p0}, Ly72/b$a;-><init>(Lec3/l;Ly72/b;)V

    return-object v0
.end method
