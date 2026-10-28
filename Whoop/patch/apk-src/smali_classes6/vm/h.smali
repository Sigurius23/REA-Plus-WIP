.class public interface abstract Lvm/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvm/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvm/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvm/h;->a:Lvm/f;

    return-void
.end method


# virtual methods
.method public abstract a(Lsn/z;Lrm/c0;)Lty/c;
.end method

.method public abstract b(Lrm/c0;)I
.end method

.method public abstract c(Landroid/os/Looper;Lsm/f;)V
.end method

.method public prepare()V
    .locals 0

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
