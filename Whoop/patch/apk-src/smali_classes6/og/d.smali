.class public final Log/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Log/g;
.implements Lq83/i;


# static fields
.field public static final w:Log/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Log/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Log/d;->w:Log/c;

    return-void
.end method


# virtual methods
.method public g(Log/b;)Log/e;
    .locals 0

    sget-object p1, Log/d;->w:Log/c;

    return-object p1
.end method

.method public j(Log/b;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public n(Ljava/lang/Throwable;Lc93/a;)V
    .locals 0

    sget-object p1, Log/b;->w:Log/b;

    return-void
.end method

.method public s(Ljava/lang/Throwable;Lc93/a;)V
    .locals 0

    sget-object p1, Log/b;->w:Log/b;

    return-void
.end method

.method public u(Ljava/lang/Throwable;Lc93/a;)V
    .locals 0

    sget-object p1, Log/b;->w:Log/b;

    return-void
.end method
