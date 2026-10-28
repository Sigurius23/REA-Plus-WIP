.class public final Lqw/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Low/a0;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final y:Lqw/c;


# instance fields
.field public w:Ljava/util/List;

.field public x:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqw/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqw/c;->w:Ljava/util/List;

    iput-object v1, v0, Lqw/c;->x:Ljava/util/List;

    sput-object v0, Lqw/c;->y:Lqw/c;

    return-void
.end method


# virtual methods
.method public final a(Low/m;Lvw/a;)Low/z;
    .locals 8

    iget-object v0, p2, Lvw/a;->a:Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lqw/c;->b(Ljava/lang/Class;Z)Z

    move-result v5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lqw/c;->b(Ljava/lang/Class;Z)Z

    move-result v4

    if-nez v5, :cond_0

    if-nez v4, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v2, Lqw/b;

    move-object v3, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lqw/b;-><init>(Lqw/c;ZZLow/m;Lvw/a;)V

    return-object v2
.end method

.method public final b(Ljava/lang/Class;Z)Z
    .locals 1

    if-nez p2, :cond_1

    const-class v0, Ljava/lang/Enum;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ltw/c;->a:Ls30/b;

    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lqw/c;->w:Ljava/util/List;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lqw/c;->x:Ljava/util/List;

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p1, 0x0

    return p1

    :cond_3
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqw/c;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method
