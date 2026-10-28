.class final Li03/b$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li03/b;->c(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.widget.triggers.WidgetLogoutUpdater"
    f = "WidgetLogoutUpdater.kt"
    l = {
        0x21
    }
    m = "registerForLogoutEvent"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Li03/b;

.field y:I


# direct methods
.method public constructor <init>(Li03/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li03/b;",
            "Lq83/d<",
            "-",
            "Li03/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li03/b$a;->x:Li03/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Li03/b$a;->w:Ljava/lang/Object;

    iget p1, p0, Li03/b$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li03/b$a;->y:I

    iget-object p1, p0, Li03/b$a;->x:Li03/b;

    invoke-virtual {p1, p0}, Li03/b;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
