.class public Lgg/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/g;


# static fields
.field public static final x:Lgg/h;


# instance fields
.field public final w:Lxb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgg/h;

    invoke-direct {v0}, Lgg/h;-><init>()V

    sput-object v0, Lgg/h;->x:Lgg/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 16

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v1, 0x1

    const-class v3, Lgg/h;

    const-string v4, "evaluateSpecificExceptions"

    const-string v5, "evaluateSpecificExceptions(Ljava/lang/Throwable;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;"

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v1, Lgg/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljava/lang/Throwable;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Lgg/a;-><init>(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v8, Landroidx/room/u;

    const/4 v14, 0x0

    const/16 v15, 0xd

    const/4 v9, 0x1

    const-class v11, Lgg/h;

    const-string v12, "evaluateServiceException"

    const-string v13, "evaluateServiceException(Laws/smithy/kotlin/runtime/ServiceException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;"

    move-object/from16 v10, p0

    invoke-direct/range {v8 .. v15}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v0, Lgg/a;

    const-class v3, Laws/smithy/kotlin/runtime/ServiceException;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-direct {v0, v3, v8}, Lgg/a;-><init>(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v8, Landroidx/room/u;

    const/16 v15, 0xe

    const-class v11, Lgg/h;

    const-string v12, "evaluateClientException"

    const-string v13, "evaluateClientException(Laws/smithy/kotlin/runtime/ClientException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;"

    invoke-direct/range {v8 .. v15}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v3, Lgg/a;

    const-class v4, Laws/smithy/kotlin/runtime/ClientException;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-direct {v3, v4, v8}, Lgg/a;-><init>(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v8, Landroidx/room/u;

    const/16 v15, 0xf

    const-class v11, Lgg/h;

    const-string v12, "evaluateBaseException"

    const-string v13, "evaluateBaseException(Laws/smithy/kotlin/runtime/SdkBaseException;)Laws/smithy/kotlin/runtime/retries/policy/RetryDirective;"

    invoke-direct/range {v8 .. v15}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v4, Lgg/a;

    const-class v5, Laws/smithy/kotlin/runtime/SdkBaseException;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-direct {v4, v2, v8}, Lgg/a;-><init>(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    filled-new-array {v1, v0, v3, v4}, [Lgg/a;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v0

    iput-object v0, v10, Lgg/h;->w:Lxb3/i;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Lgg/e;
    .locals 1

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Lgg/e;
    .locals 4

    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_0

    sget-object p1, Lgg/d;->a:Lgg/d;

    return-object p1

    :cond_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lgg/h;->w:Lxb3/i;

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgg/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Lgg/a;->a:Lj93/d;

    invoke-static {v3, p1}, Lx30/s0;->D(Lj93/d;Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Throwable;

    if-eqz v3, :cond_2

    iget-object v1, v1, Lgg/a;->b:Lkotlin/jvm/internal/i;

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lgg/e;

    :cond_2
    if-eqz v2, :cond_1

    :cond_3
    if-nez v2, :cond_4

    sget-object p1, Lgg/c;->a:Lgg/c;

    return-object p1

    :cond_4
    return-object v2
.end method
