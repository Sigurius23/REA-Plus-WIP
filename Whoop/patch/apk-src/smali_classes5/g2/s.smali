.class public final Lg2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lg2/s;

.field public static final c:Lg2/s;

.field public static final d:Lg2/s;


# instance fields
.field public final a:Lr1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg2/s;

    invoke-direct {v0}, Lg2/s;-><init>()V

    sput-object v0, Lg2/s;->b:Lg2/s;

    new-instance v0, Lg2/s;

    invoke-direct {v0}, Lg2/s;-><init>()V

    sput-object v0, Lg2/s;->c:Lg2/s;

    new-instance v0, Lg2/s;

    invoke-direct {v0}, Lg2/s;-><init>()V

    sput-object v0, Lg2/s;->d:Lg2/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v1, v1, [Lg2/t;

    invoke-direct {v0, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lg2/s;->a:Lr1/c;

    return-void
.end method

.method public static c(Lg2/s;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lg2/n;

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lg2/n;-><init>(II)V

    invoke-virtual {p0, v0}, Lg2/s;->a(Lkotlin/jvm/functions/Function1;)Z

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)Z
    .locals 14

    sget-object v0, Lg2/s;->b:Lg2/s;

    const-string v1, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    if-eq p0, v0, :cond_13

    sget-object v0, Lg2/s;->c:Lg2/s;

    if-eq p0, v0, :cond_12

    iget-object v0, p0, Lg2/s;->a:Lr1/c;

    iget v1, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string p1, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return v2

    :cond_0
    iget-object v0, v0, Lr1/c;->w:[Ljava/lang/Object;

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_11

    aget-object v5, v0, v3

    check-cast v5, Lg2/t;

    check-cast v5, Lb2/v;

    iget-object v6, v5, Lb2/v;->w:Lb2/v;

    iget-boolean v6, v6, Lb2/v;->N:Z

    if-nez v6, :cond_1

    const-string v6, "visitChildren called on an unattached node"

    invoke-static {v6}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance v6, Lr1/c;

    const/16 v7, 0x10

    new-array v8, v7, [Lb2/v;

    invoke-direct {v6, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object v5, v5, Lb2/v;->w:Lb2/v;

    iget-object v8, v5, Lb2/v;->F:Lb2/v;

    if-nez v8, :cond_2

    invoke-static {v6, v5}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v6, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    iget v5, v6, Lr1/c;->y:I

    if-eqz v5, :cond_10

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v6, v5}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb2/v;

    iget v8, v5, Lb2/v;->z:I

    and-int/lit16 v8, v8, 0x400

    if-nez v8, :cond_4

    invoke-static {v6, v5}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_1

    :cond_4
    :goto_2
    if-eqz v5, :cond_3

    iget v8, v5, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_f

    const/4 v8, 0x0

    move-object v9, v8

    :goto_3
    if-eqz v5, :cond_3

    instance-of v10, v5, Lg2/x;

    const/4 v11, 0x1

    if-eqz v10, :cond_6

    check-cast v5, Lg2/x;

    invoke-virtual {v5}, Lg2/x;->Y0()Lg2/o;

    move-result-object v10

    iget-boolean v10, v10, Lg2/o;->a:Z

    if-eqz v10, :cond_5

    invoke-interface {p1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    goto :goto_4

    :cond_5
    const/4 v10, 0x7

    invoke-static {v5, v10, p1}, Lg2/g;->j(Lg2/x;ILkotlin/jvm/functions/Function1;)Z

    move-result v5

    :goto_4
    if-eqz v5, :cond_e

    move v4, v11

    goto :goto_9

    :cond_6
    iget v10, v5, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_7

    move v10, v11

    goto :goto_5

    :cond_7
    move v10, v2

    :goto_5
    if-eqz v10, :cond_e

    instance-of v10, v5, La3/o;

    if-eqz v10, :cond_e

    move-object v10, v5

    check-cast v10, La3/o;

    iget-object v10, v10, La3/o;->P:Lb2/v;

    move v12, v2

    :goto_6
    if-eqz v10, :cond_d

    iget v13, v10, Lb2/v;->y:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_8

    move v13, v11

    goto :goto_7

    :cond_8
    move v13, v2

    :goto_7
    if-eqz v13, :cond_c

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v11, :cond_9

    move-object v5, v10

    goto :goto_8

    :cond_9
    if-nez v9, :cond_a

    new-instance v9, Lr1/c;

    new-array v13, v7, [Lb2/v;

    invoke-direct {v9, v13}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_a
    if-eqz v5, :cond_b

    invoke-virtual {v9, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v5, v8

    :cond_b
    invoke-virtual {v9, v10}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_c
    :goto_8
    iget-object v10, v10, Lb2/v;->F:Lb2/v;

    goto :goto_6

    :cond_d
    if-ne v12, v11, :cond_e

    goto :goto_3

    :cond_e
    invoke-static {v9}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v5

    goto :goto_3

    :cond_f
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_10
    :goto_9
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_11
    return v4

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 3

    new-instance v0, Lg2/n;

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lg2/n;-><init>(II)V

    invoke-virtual {p0, v0}, Lg2/s;->a(Lkotlin/jvm/functions/Function1;)Z

    return-void
.end method
