.class public final Lw73/j;
.super Ll73/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final w:Lw73/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw73/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw73/j;->w:Lw73/j;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(Ll73/d;)V
    .locals 1

    sget-object v0, Lq73/d;->w:Lq73/d;

    invoke-interface {p1, v0}, Ll73/d;->b(Ln73/b;)V

    invoke-interface {p1}, Ll73/d;->onComplete()V

    return-void
.end method
