.class final Ldj0/b$r;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj0/b;->K(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        0x153,
        0x156
    }
    m = "signOut"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldj0/b;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldj0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj0/b;",
            "Lq83/d<",
            "-",
            "Ldj0/b$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldj0/b$r;->E:Ldj0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldj0/b$r;->z:Ljava/lang/Object;

    iget p1, p0, Ldj0/b$r;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldj0/b$r;->F:I

    iget-object p1, p0, Ldj0/b$r;->E:Ldj0/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldj0/b;->K(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
