.class public abstract Luo/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Boolean;

.field public b:Z

.field public final synthetic c:Luo/c;

.field public final d:I

.field public final e:Landroid/os/Bundle;

.field public final synthetic f:Luo/c;


# direct methods
.method public constructor <init>(Luo/c;ILandroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/u;->f:Luo/c;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Luo/u;->c:Luo/c;

    iput-object v0, p0, Luo/u;->a:Ljava/lang/Boolean;

    const/4 p1, 0x0

    iput-boolean p1, p0, Luo/u;->b:Z

    iput p2, p0, Luo/u;->d:I

    iput-object p3, p0, Luo/u;->e:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Lcom/google/android/gms/common/a;)V
.end method
