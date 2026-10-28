.class public final Lol/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lzk/x;


# instance fields
.field public final a:La0/g;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lzk/x;

    new-instance v1, Lzk/j;

    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v6, Lll/c;

    const/4 v2, 0x0

    invoke-direct {v6, v2}, Lll/c;-><init>(I)V

    const/4 v7, 0x0

    const-class v2, Ljava/lang/Object;

    const-class v3, Ljava/lang/Object;

    const-class v4, Ljava/lang/Object;

    invoke-direct/range {v1 .. v7}, Lzk/j;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lll/a;Ls/m2;)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    const-class v1, Ljava/lang/Object;

    const-class v2, Ljava/lang/Object;

    const-class v3, Ljava/lang/Object;

    invoke-direct/range {v0 .. v5}, Lzk/x;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ls/m2;)V

    sput-object v0, Lol/c;->c:Lzk/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Lol/c;->a:La0/g;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lol/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method
