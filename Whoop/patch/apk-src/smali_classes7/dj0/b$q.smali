.class final Ldj0/b$q;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj0/b;->I(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        0x9c,
        0x9e,
        0xa7
    }
    m = "signIn"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Z

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Ldj0/b;

.field J:I

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
            "Ldj0/b$q;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldj0/b$q;->I:Ldj0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ldj0/b$q;->H:Ljava/lang/Object;

    iget p1, p0, Ldj0/b$q;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldj0/b$q;->J:I

    iget-object v0, p0, Ldj0/b$q;->I:Ldj0/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Ldj0/b;->k(Ldj0/b;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
