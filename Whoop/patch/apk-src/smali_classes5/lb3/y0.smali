.class public abstract Llb3/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Llb3/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llb3/w0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Llb3/y0;->a:Llb3/w0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Ls93/i;)Ls93/i;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract d(Llb3/y;)Llb3/u0;
.end method

.method public e()Z
    .locals 1

    instance-of v0, p0, Llb3/w0;

    return v0
.end method

.method public f(Llb3/y;Llb3/g1;)Llb3/y;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
