.class public final Ld4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ld4/g;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Ld4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld4/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld4/g;->c:Ld4/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ld4/h;->F:Lhg3/i;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lhg3/i;->i0(Ld4/g;Ljava/lang/Thread;)V

    return-void
.end method
