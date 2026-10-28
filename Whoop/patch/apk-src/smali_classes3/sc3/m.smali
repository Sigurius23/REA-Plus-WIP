.class public final Lsc3/m;
.super Lsc3/a;
.source "SourceFile"


# instance fields
.field public final a:Lsc3/r;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsc3/r;Lrc3/a;I)V
    .locals 1

    iget-object v0, p1, Lsc3/r;->b:Ljava/lang/String;

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const-string p3, "name"

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/m;->a:Lsc3/r;

    iput-object v0, p0, Lsc3/m;->b:Ljava/lang/String;

    iput-object p2, p0, Lsc3/m;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lsc3/r;
    .locals 1

    iget-object v0, p0, Lsc3/m;->a:Lsc3/r;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsc3/m;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsc3/m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lqc3/l0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
