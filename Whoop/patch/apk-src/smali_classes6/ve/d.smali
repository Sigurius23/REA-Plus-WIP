.class public final Lve/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Lgf/b;I)Lve/e;
    .locals 6

    and-int/lit8 v0, p5, 0x10

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    const-string v0, "IMDSv2"

    :goto_0
    and-int/lit8 p5, p5, 0x20

    if-eqz p5, :cond_1

    move-object p4, v1

    :cond_1
    const-string p5, "accessKeyId"

    invoke-static {p0, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "secretAccessKey"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_5

    if-eqz p4, :cond_2

    sget-object p5, Lxf/b;->a:Lgf/a;

    invoke-interface {p4, p5}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p5

    move-object v1, p5

    check-cast v1, Ljava/lang/String;

    :cond_2
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_5

    if-eqz p4, :cond_3

    invoke-static {p4}, Ljc/x;->w0(Lgf/b;)Lgf/c;

    move-result-object p4

    goto :goto_1

    :cond_3
    new-instance p4, Lgf/c;

    invoke-direct {p4}, Lgf/c;-><init>()V

    :goto_1
    sget-object p5, Lxf/b;->a:Lgf/a;

    invoke-static {p4, p5, v0}, Ljc/x;->s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    move-object v5, p4

    goto :goto_3

    :cond_5
    if-nez p4, :cond_4

    sget-object p4, Lgf/i;->w:Lgf/i;

    goto :goto_2

    :goto_3
    new-instance v0, Lve/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lve/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Lgf/b;)V

    return-object v0
.end method
