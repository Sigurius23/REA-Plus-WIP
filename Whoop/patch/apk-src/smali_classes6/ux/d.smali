.class public final Lux/d;
.super Lux/e;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly00/g6;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lux/d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ly00/f4;Ly00/u5;Ly00/j5;Ly00/o;Ly00/a6;Ly00/n;)Ly00/s;
    .locals 17

    move-object/from16 v0, p2

    const-string v1, "paymentMethodId"

    move-object/from16 v4, p1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "paymentMethodType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, v2}, Ls4/b;->s(Ly00/f4;ZLy00/u5;Ly00/o;)Ly00/x2;

    move-result-object v9

    if-eqz p4, :cond_0

    invoke-static/range {p4 .. p4}, Ls4/b;->a(Ly00/j5;)Ljava/lang/Boolean;

    move-result-object v2

    :cond_0
    move-object v10, v2

    iget-object v11, v0, Ly00/f4;->w:Ljava/lang/String;

    const-string v0, "clientSecret"

    move-object/from16 v1, p0

    iget-object v3, v1, Lux/d;->a:Ljava/lang/String;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCode"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ly00/r;

    const/4 v15, 0x0

    const/16 v16, 0x121c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move-object/from16 v13, p6

    move-object/from16 v14, p7

    invoke-direct/range {v2 .. v16}, Ly00/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/l5;Ly00/a6;Ly00/n;Ljava/lang/String;I)V

    return-object v2
.end method

.method public final b(Ljava/lang/String;Ly00/a6;Ly00/n;)Ly00/s;
    .locals 16

    const-string v0, "confirmationTokenId"

    move-object/from16 v14, p1

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly00/r;

    const/4 v11, 0x0

    const/16 v15, 0x3fe

    move-object/from16 v0, p0

    iget-object v2, v0, Lux/d;->a:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    invoke-direct/range {v1 .. v15}, Ly00/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/l5;Ly00/a6;Ly00/n;Ljava/lang/String;I)V

    return-object v1
.end method

.method public final c(Ly00/d5;Ly00/u5;Ly00/j5;Ly00/n;)Ly00/s;
    .locals 16

    move-object/from16 v3, p1

    const-string v0, "createParams"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    invoke-static/range {p3 .. p3}, Ls4/b;->a(Ly00/j5;)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const-string v0, "clientSecret"

    move-object/from16 v15, p0

    iget-object v1, v15, Lux/d;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/r;

    iget-object v9, v3, Ly00/d5;->w:Ljava/lang/String;

    const/4 v13, 0x0

    const/16 v14, 0x121a

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, p4

    invoke-direct/range {v0 .. v14}, Ly00/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/l5;Ly00/a6;Ly00/n;Ljava/lang/String;I)V

    return-object v0
.end method
