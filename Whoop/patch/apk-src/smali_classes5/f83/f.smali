.class public abstract Lf83/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll73/g;

.field public static final b:Ll73/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf83/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lf83/b;-><init>(I)V

    invoke-static {v0}, Ljc/x;->m(Ljava/util/concurrent/Callable;)Ll73/g;

    new-instance v0, Lf83/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf83/b;-><init>(I)V

    invoke-static {v0}, Ljc/x;->m(Ljava/util/concurrent/Callable;)Ll73/g;

    move-result-object v0

    sput-object v0, Lf83/f;->a:Ll73/g;

    new-instance v0, Lf83/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf83/b;-><init>(I)V

    invoke-static {v0}, Ljc/x;->m(Ljava/util/concurrent/Callable;)Ll73/g;

    move-result-object v0

    sput-object v0, Lf83/f;->b:Ll73/g;

    sget v0, Ly73/q;->a:I

    new-instance v0, Lf83/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lf83/b;-><init>(I)V

    invoke-static {v0}, Ljc/x;->m(Ljava/util/concurrent/Callable;)Ll73/g;

    return-void
.end method
