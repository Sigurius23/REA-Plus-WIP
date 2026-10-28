.class public final Lds/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lds/m;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Lds/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lds/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lds/m;->c:Lds/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lds/n;->F:Lbi/g;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lbi/g;->R(Lds/m;Ljava/lang/Thread;)V

    return-void
.end method
