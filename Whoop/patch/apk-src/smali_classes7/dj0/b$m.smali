.class final Ldj0/b$m;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj0/b;->y(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.auth.CognitoAuthApi"
    f = "CognitoAuthApi.kt"
    l = {
        0x33d,
        0x41,
        0x42,
        0x64,
        0x7b
    }
    m = "improvedMetricsRefreshToken"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Z

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Ldj0/b;

.field K:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldj0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj0/b;",
            "Lq83/d<",
            "-",
            "Ldj0/b$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldj0/b$m;->J:Ldj0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Ldj0/b$m;->I:Ljava/lang/Object;

    iget p1, p0, Ldj0/b$m;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldj0/b$m;->K:I

    iget-object p1, p0, Ldj0/b$m;->J:Ldj0/b;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Ldj0/b;->y(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
