.class public final Lv73/b;
.super Ll73/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final x:Lv73/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv73/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv73/b;->x:Lv73/b;

    return-void
.end method


# virtual methods
.method public final c(Ll73/b;)V
    .locals 1

    sget-object v0, La83/b;->w:La83/b;

    invoke-interface {p1, v0}, Leg3/a;->b(Leg3/b;)V

    invoke-interface {p1}, Leg3/a;->onComplete()V

    return-void
.end method

.method public final call()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
