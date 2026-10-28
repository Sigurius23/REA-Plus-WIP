.class public final Le8/e;
.super Lw7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le8/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Ll83/p;

.field public final x:Ljava/lang/String;

.field public final y:I

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Le8/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 1

    const-string v0, "callingPackage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lw7/a;-><init>()V

    iput-object p1, p0, Le8/e;->x:Ljava/lang/String;

    iput p2, p0, Le8/e;->y:I

    iput-object p3, p0, Le8/e;->z:Ljava/lang/String;

    iput-boolean p4, p0, Le8/e;->E:Z

    new-instance p1, Lav/b;

    const/16 p2, 0x8

    invoke-direct {p1, p0, p2}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Le8/e;->F:Ll83/p;

    return-void
.end method


# virtual methods
.method public final b()Landroidx/health/platform/client/proto/a;
    .locals 2

    iget-object v0, p0, Le8/e;->F:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-proto>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/health/platform/client/proto/m2;

    return-object v0
.end method
