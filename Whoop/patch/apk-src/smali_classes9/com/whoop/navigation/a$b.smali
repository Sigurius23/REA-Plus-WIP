.class final Lcom/whoop/navigation/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/navigation/a;->g(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.navigation.DeepLinkNavigationParser"
    f = "DeepLinkNavigationParser.kt"
    l = {
        0x6e
    }
    m = "resolveRemotely"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/navigation/a;


# direct methods
.method public constructor <init>(Lcom/whoop/navigation/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/navigation/a$b;->z:Lcom/whoop/navigation/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/navigation/a$b;->y:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/navigation/a$b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/navigation/a$b;->E:I

    iget-object p1, p0, Lcom/whoop/navigation/a$b;->z:Lcom/whoop/navigation/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/whoop/navigation/a;->a(Lcom/whoop/navigation/a;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
