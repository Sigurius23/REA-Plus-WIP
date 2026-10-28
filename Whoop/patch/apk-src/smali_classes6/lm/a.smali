.class public final Llm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llm/b;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lgm/r;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lhm/e;

.field public final d:Lnm/d;

.field public final e:Lom/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lgm/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Llm/a;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lhm/e;Lgm/r;Lnm/d;Lom/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llm/a;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Llm/a;->c:Lhm/e;

    iput-object p3, p0, Llm/a;->a:Lgm/r;

    iput-object p4, p0, Llm/a;->d:Lnm/d;

    iput-object p5, p0, Llm/a;->e:Lom/b;

    return-void
.end method
