.class public final Lx8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx8/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx8/p;->a:Lx8/p;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;
    .locals 2

    new-instance v0, Lx8/r;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-direct {v0, v1}, Lx8/r;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method
