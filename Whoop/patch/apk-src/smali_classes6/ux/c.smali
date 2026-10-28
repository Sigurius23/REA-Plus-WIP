.class public final Lux/c;
.super Lux/e;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ly00/l3;

.field public final c:Ly00/p;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly00/l3;Ly00/p;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lux/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lux/c;->b:Ly00/l3;

    iput-object p3, p0, Lux/c;->c:Ly00/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ly00/f4;Ly00/u5;Ly00/j5;Ly00/o;Ly00/a6;Ly00/n;)Ly00/s;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "paymentMethodId"

    move-object/from16 v5, p1

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentMethodType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v1, Ly00/f4;->w:Ljava/lang/String;

    iget-object v2, v0, Lux/c;->b:Ly00/l3;

    invoke-virtual {v2, v13}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result v2

    move-object/from16 v8, p3

    move-object/from16 v10, p5

    invoke-static {v1, v2, v8, v10}, Ls4/b;->s(Ly00/f4;ZLy00/u5;Ly00/o;)Ly00/x2;

    move-result-object v9

    if-eqz p4, :cond_0

    invoke-static/range {p4 .. p4}, Ls4/b;->a(Ly00/j5;)Ljava/lang/Boolean;

    move-result-object v1

    :goto_0
    move-object v12, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const-string v1, "clientSecret"

    iget-object v6, v0, Lux/c;->a:Ljava/lang/String;

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/q;

    const/16 v16, 0x0

    const v17, 0x420ad

    const/4 v4, 0x0

    const/4 v7, 0x0

    iget-object v11, v0, Lux/c;->c:Ly00/p;

    move-object/from16 v14, p6

    move-object/from16 v15, p7

    invoke-direct/range {v3 .. v17}, Ly00/q;-><init>(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ly00/u5;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;I)V

    return-object v3
.end method

.method public final b(Ljava/lang/String;Ly00/a6;Ly00/n;)Ly00/s;
    .locals 16

    const-string v0, "confirmationTokenId"

    move-object/from16 v14, p1

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly00/q;

    const/4 v11, 0x0

    const v15, 0xffef

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v4, v0, Lux/c;->a:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    invoke-direct/range {v1 .. v15}, Ly00/q;-><init>(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ly00/u5;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;I)V

    return-object v1
.end method

.method public final c(Ly00/d5;Ly00/u5;Ly00/j5;Ly00/n;)Ly00/s;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const-string v1, "createParams"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-static/range {p3 .. p3}, Ls4/b;->a(Ly00/j5;)Ljava/lang/Boolean;

    move-result-object v1

    :goto_0
    move-object v10, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const-string v1, "clientSecret"

    iget-object v4, v0, Lux/c;->a:Ljava/lang/String;

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v2, Ly00/d5;->w:Ljava/lang/String;

    new-instance v1, Ly00/q;

    const/4 v14, 0x0

    const v15, 0x420ae

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v9, v0, Lux/c;->c:Ly00/p;

    const/4 v12, 0x0

    move-object/from16 v6, p2

    move-object/from16 v13, p4

    invoke-direct/range {v1 .. v15}, Ly00/q;-><init>(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ly00/u5;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;I)V

    return-object v1
.end method
