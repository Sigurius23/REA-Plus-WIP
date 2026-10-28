.class final Ly02/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly02/a;->a(Lf63/c;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.network.http.response.HttpResponseByteStringKt"
    f = "HttpResponseByteString.kt"
    l = {
        0x9
    }
    m = "bodyByteString"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ly02/a$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ly02/a$a;->E:Ljava/lang/Object;

    iget p1, p0, Ly02/a$a;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly02/a$a;->F:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ly02/a;->a(Lf63/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
