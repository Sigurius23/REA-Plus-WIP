.class public final synthetic Lrr2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic w:Lrr2/h;

.field public final synthetic x:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method public synthetic constructor <init>(Lrr2/h;Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr2/g;->w:Lrr2/h;

    iput-object p2, p0, Lrr2/g;->x:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lrr2/g;->w:Lrr2/h;

    iget-object v1, p0, Lrr2/g;->x:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {v0, v1, p1, p2}, Lrr2/h;->m(Lrr2/h;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
