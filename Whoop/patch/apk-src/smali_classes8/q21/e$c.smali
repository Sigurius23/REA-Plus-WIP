.class public final Lq21/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq21/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lq21/e$c;",
        "",
        "<init>",
        "()V",
        "",
        "style",
        "Lq21/e;",
        "a",
        "(Ljava/lang/String;)Lq21/e;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq21/e$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lq21/e;
    .locals 13

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-wide v1, 0xfff3f5f9L

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "FAMILY_PLAN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v3, Lq21/e;

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object v4

    sget-object v7, Lq21/f;->FAMILY_PLAN:Lq21/f;

    const/16 v11, 0x76

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lq21/e;-><init>(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :sswitch_1
    const-string v0, "PEAK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    new-instance v0, Lq21/e;

    sget-object p1, Lq21/e$c$a;->w:Lq21/e$c$a;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    sget-object v4, Lq21/f;->PEAK:Lq21/f;

    const/16 v8, 0x76

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lq21/e;-><init>(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :sswitch_2
    const-string v0, "LIFE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lq21/e;

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object v2

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object v3

    sget-object v4, Lq21/f;->LIFE:Lq21/f;

    const/16 v8, 0x71

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lq21/e;-><init>(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :sswitch_3
    const-string v0, "ONE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v3, Lq21/e;

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object v4

    sget-object v7, Lq21/f;->ONE:Lq21/f;

    const/16 v11, 0x76

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lq21/e;-><init>(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :sswitch_4
    const-string v0, "DOWNGRADE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance v3, Lq21/e;

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object v4

    sget-object v7, Lq21/f;->DOWNGRADE:Lq21/f;

    const/16 v11, 0x76

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lq21/e;-><init>(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :sswitch_5
    const-string v0, "ADVANCED_LABS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    new-instance v0, Lq21/e;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lq21/e;-><init>(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_5
    invoke-static {}, Lgb1/b0;->Q()Li2/t;

    move-result-object v4

    sget-object p1, Lq21/e$c$b;->w:Lq21/e$c$b;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    sget-object v5, Lq21/f;->ADVANCED_LABS:Lq21/f;

    const/4 p1, 0x1

    int-to-float p1, p1

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    sget-object p1, Lq21/e$c$c;->w:Lq21/e$c$c;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    new-instance v1, Lq21/e;

    const/16 v9, 0x42

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lq21/e;-><init>(Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x41d3517d -> :sswitch_5
        -0xbeebfab -> :sswitch_4
        0x13246 -> :sswitch_3
        0x23a6fc -> :sswitch_2
        0x2568df -> :sswitch_1
        0x4692eb24 -> :sswitch_0
    .end sparse-switch
.end method
