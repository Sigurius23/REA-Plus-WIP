.class public abstract Lmg/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lmg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmg/c;

    sget-object v1, Lmg/b;->b:Lmg/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lmg/c;->a:Ljava/lang/Object;

    sput-object v0, Lmg/d;->a:Lmg/c;

    const-class v0, Ljava/lang/Object;

    const-string v1, "a"

    const-class v2, Lmg/c;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method
