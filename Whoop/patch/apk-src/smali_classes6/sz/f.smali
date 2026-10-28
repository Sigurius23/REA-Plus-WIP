.class public final Lsz/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final w:Lsz/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsz/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lsz/f;->w:Lsz/f;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    const-string v0, "r"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
