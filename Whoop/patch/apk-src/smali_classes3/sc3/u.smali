.class public final Lsc3/u;
.super Lsc3/a;
.source "SourceFile"


# instance fields
.field public final a:Lsc3/r;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Integer;

.field public final d:Lqc3/l0;

.field public final e:I


# direct methods
.method public constructor <init>(Lsc3/r;ILqc3/l0;I)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p1, Lsc3/r;->b:Ljava/lang/String;

    and-int/lit8 v2, p4, 0x10

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v0, v3

    :cond_0
    and-int/lit8 p4, p4, 0x20

    if-eqz p4, :cond_1

    move-object p3, v3

    :cond_1
    const-string p4, "name"

    invoke-static {v1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/u;->a:Lsc3/r;

    iput-object v1, p0, Lsc3/u;->b:Ljava/lang/String;

    iput-object v0, p0, Lsc3/u;->c:Ljava/lang/Integer;

    iput-object p3, p0, Lsc3/u;->d:Lqc3/l0;

    const/16 p1, 0xa

    if-ge p2, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x64

    if-ge p2, p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    const/16 p1, 0x3e8

    if-ge p2, p1, :cond_4

    const/4 p1, 0x3

    :goto_0
    iput p1, p0, Lsc3/u;->e:I

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Max value "

    const-string p4, " is too large"

    invoke-static {p2, p3, p4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lsc3/r;
    .locals 1

    iget-object v0, p0, Lsc3/u;->a:Lsc3/r;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsc3/u;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsc3/u;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lqc3/l0;
    .locals 1

    iget-object v0, p0, Lsc3/u;->d:Lqc3/l0;

    return-object v0
.end method
