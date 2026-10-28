.class public abstract Lbc3/c1;
.super Lbc3/z;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final Key:Lbc3/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbc3/b1;

    sget-object v1, Lbc3/z;->Key:Lbc3/y;

    new-instance v2, La11/g;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, La11/g;-><init>(I)V

    invoke-direct {v0, v1, v2}, Lq83/b;-><init>(Lq83/i;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lbc3/c1;->Key:Lbc3/b1;

    return-void
.end method


# virtual methods
.method public abstract getExecutor()Ljava/util/concurrent/Executor;
.end method
