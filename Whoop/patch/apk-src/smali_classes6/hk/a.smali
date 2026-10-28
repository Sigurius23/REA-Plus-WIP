.class public final Lhk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfk/a;


# static fields
.field public static final a:Lhk/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhk/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhk/a;->a:Lhk/a;

    return-void
.end method

.method public static a(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p0}, Le4/p;->b(II)I

    move-result p0

    if-gtz p0, :cond_0

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final debug(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {v0, p1}, Lhk/a;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final error(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {v0, p1}, Lhk/a;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final info(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Lhk/a;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final warn(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-static {v0, p1}, Lhk/a;->a(ILjava/lang/String;)V

    return-void
.end method
