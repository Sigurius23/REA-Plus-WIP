.class public final Lt7/c;
.super Lw7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt7/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:I

.field public final y:Ljava/lang/String;

.field public final z:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Lt7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lw7/a;-><init>()V

    iput p1, p0, Lt7/c;->x:I

    iput-object p2, p0, Lt7/c;->y:Ljava/lang/String;

    new-instance p1, Lm5/k;

    const/16 p2, 0x9

    invoke-direct {p1, p0, p2}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt7/c;->z:Ll83/p;

    return-void
.end method


# virtual methods
.method public final b()Landroidx/health/platform/client/proto/a;
    .locals 2

    iget-object v0, p0, Lt7/c;->z:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-proto>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/health/platform/client/proto/j0;

    return-object v0
.end method
