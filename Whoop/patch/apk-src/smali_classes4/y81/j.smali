.class public abstract Ly81/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a)\u0010\u0005\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lkd1/g;",
        "Li2/x;",
        "Ly81/i;",
        "block",
        "d",
        "(Lkotlin/jvm/functions/Function1;)Ly81/i;",
        "a",
        "Ly81/i;",
        "c",
        "()Ly81/i;",
        "DarkColors",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ly81/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvb1/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lvb1/a;-><init>(I)V

    invoke-static {v0}, Ly81/j;->d(Lkotlin/jvm/functions/Function1;)Ly81/i;

    move-result-object v0

    sput-object v0, Ly81/j;->a:Ly81/i;

    return-void
.end method

.method public static synthetic a(Lkd1/g;)Ly81/i;
    .locals 0

    invoke-static {p0}, Ly81/j;->b(Lkd1/g;)Ly81/i;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lkd1/g;)Ly81/i;
    .locals 236

    const-string v0, "$this$whoopColors"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly81/i;

    const-wide v7, 0xff00f19fL

    invoke-static {v7, v8}, Li2/w0;->e(J)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "Accents Action"

    move-object v2, v4

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v9, v2, Li2/x;->a:J

    const-wide v11, 0xffff0026L

    invoke-static {v11, v12}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    move-object v2, v3

    const-string v3, "Accents Alert"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v13, v2, Li2/x;->a:J

    const v1, 0x26ff0026

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    move-object v2, v3

    const-string v3, "Accents Alert Trend 15"

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffffeb62L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide v15, v3

    const-string v3, "Accents Focus"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x26ffeb62

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v17, v3

    const-string v3, "Accents Focus 15"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffffa722L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v19, v3

    const-string v3, "Accents Negative Trend"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x26ffa722

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v21, v3

    const-string v3, "Accents Negative Trend 15"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xfffffbe2L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v23, v3

    const-string v3, "Accents Note"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffcb4ed8L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v25, v3

    const-string v3, "Accents Onboarding Action"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static {v7, v8}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide v7, v3

    const-string v3, "Accents Positive Trend"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x2600f19f

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v27, v3

    const-string v3, "Accents Positive Trend 15"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v29, 0xff3f3cebL

    invoke-static/range {v29 .. v30}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v31, v3

    const-string v3, "America 250 Blue"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v33, 0xffb22234L

    invoke-static/range {v33 .. v34}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v35, v3

    const-string v3, "America 250 Red"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff1a2227L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v37, v3

    const-string v3, "Backgrounds Dark Alt"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff101518L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v39, v3

    const-string v3, "Backgrounds Dark Std"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const/high16 v3, 0x1a000000

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v41, v3

    const-string v3, "Black 10"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const/high16 v3, 0x33000000

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v43, v3

    const-string v3, "Black 20"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const/high16 v3, 0x4d000000    # 1.3421773E8f

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v45, v3

    const-string v3, "Black 30"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const/high16 v3, 0xd000000

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v47, v3

    const-string v3, "Black 5"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0x80000000L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v49, v3

    const-string v3, "Black 50"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xb3000000L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v51, v3

    const-string v3, "Black 70"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xe6000000L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v53, v3

    const-string v3, "Black 90"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff000000L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v55, v3

    const-string v3, "Brand Black"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static {v11, v12}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v57, v3

    const-string v3, "Brand Primary"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffffffffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v59, v3

    const-string v3, "Brand White"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffd0a74eL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v61, v3

    const-string v3, "Brand Whoop Pro"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffa58b7aL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v63, v3

    const-string v3, "Bronze"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff3a4047L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v65, v3

    const-string v3, "Challenge Gauge Inactive"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff6e9cffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v67, v3

    const-string v3, "Coach Blue"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffddcb70L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v69, v3

    const-string v3, "Gold"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff969696L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v71, v3

    const-string v3, "Grey L1"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffa6a6a6L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v73, v3

    const-string v3, "Grey L2"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v75, 0xffc8c8c8L

    invoke-static/range {v75 .. v76}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v77, v3

    const-string v3, "Grey L3"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffdcdcdcL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v79, v3

    const-string v3, "Grey L4"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffebebebL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v81, v3

    const-string v3, "Grey L5"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xfff5f5f5L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v83, v3

    const-string v3, "Grey L6"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xfffafafaL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v85, v3

    const-string v3, "Grey L7"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff252525L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v87, v3

    const-string v3, "Grey L8"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffabdee9L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v89, v3

    const-string v3, "Health Calibrating"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff71ccf1L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v91, v3

    const-string v3, "Health Neutral"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffede194L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v93, v3

    const-string v3, "Health Old"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff05f0a2L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v95, v3

    const-string v3, "Health Young"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v97, 0xffff7765L

    invoke-static/range {v97 .. v98}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v99, v3

    const-string v3, "MCI Red"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x7fff7765

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v101, v3

    const-string v3, "MCI Red 50"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v103, 0x2667aee6

    invoke-static/range {v103 .. v103}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v104, v3

    const-string v3, "Neutral 15"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v29 .. v30}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v29, v3

    const-string v3, "Patriotic Blue"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v33 .. v34}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v33, v3

    const-string v3, "Patriotic Red"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v106, 0xffc1c5d0L

    invoke-static/range {v106 .. v107}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v108, v3

    const-string v3, "Platinum"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v110, 0xff67aee6L

    invoke-static/range {v110 .. v111}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v112, v3

    const-string v3, "Recovery"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x1a67aee6

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v114, v3

    const-string v3, "Recovery 10"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff19ec06L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v116, v3

    const-string v3, "Recovery High Recovery"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x1a19ec06

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v118, v3

    const-string v3, "Recovery High Recovery 10"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static {v11, v12}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide v11, v3

    const-string v3, "Recovery Low Recovery"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffffde00L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v120, v3

    const-string v3, "Recovery Medium Recovery"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff959799L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v122, v3

    const-string v3, "Secondary Text"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v106 .. v107}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v106, v3

    const-string v3, "Silver"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v124, 0xff7ba1bbL

    invoke-static/range {v124 .. v125}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v126, v3

    const-string v3, "Sleep"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v75 .. v76}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v75, v3

    const-string v3, "Sleep Awake"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xfffa95faL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v128, v3

    const-string v3, "Sleep Deep Sleep"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v130, 0xffa4a3f1L

    invoke-static/range {v130 .. v131}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v132, v3

    const-string v3, "Sleep Light Sleep"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v134, 0xffac5aedL

    invoke-static/range {v134 .. v135}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v136, v3

    const-string v3, "Sleep Rem Sleep"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff0093e7L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v138, v3

    const-string v3, "Strain"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffadc2cdL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v140, v3

    const-string v3, "Strain Zone 1"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff479ac2L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v142, v3

    const-string v3, "Strain Zone 2"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v144, 0xff59b996L

    invoke-static/range {v144 .. v145}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v146, v3

    const-string v3, "Strain Zone 3"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xfffcac5dL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v148, v3

    const-string v3, "Strain Zone 4"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xffff6422L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v150, v3

    const-string v3, "Strain Zone 5"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff6bbcc1L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v152, v3

    const-string v3, "Sufficient Trend"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x266bbcc1

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v154, v3

    const-string v3, "Sufficient Trend 15"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v124 .. v125}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v156, v3

    const-string v3, "Surface MCI Birth Control"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x267ba1bb

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v158, v3

    const-string v3, "Surface MCI Birth Control Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v130 .. v131}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v160, v3

    const-string v3, "Surface MCI Follicular"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v162, 0x26a4a3f1

    invoke-static/range {v162 .. v162}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v163, v3

    const-string v3, "Surface MCI Follicular Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v134 .. v135}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v165, v3

    const-string v3, "Surface MCI Luteal"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v167, 0x26ac5aed

    invoke-static/range {v167 .. v167}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v168, v3

    const-string v3, "Surface MCI Luteal Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v97 .. v98}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v170, v3

    const-string v3, "Surface MCI Menstrual"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x26ff7765

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v172, v3

    const-string v3, "Surface MCI Menstrual Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v110 .. v111}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v174, v3

    const-string v3, "Surface MCI Ovulatory"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v103 .. v103}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v176, v3

    const-string v3, "Surface MCI Ovulatory Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v130 .. v131}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v178, v3

    const-string v3, "Surface Pregnancy Trimester 1"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v162 .. v162}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v180, v3

    const-string v3, "Surface Pregnancy Trimester 1 Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v134 .. v135}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v182, v3

    const-string v3, "Surface Pregnancy Trimester 2"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v167 .. v167}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v184, v3

    const-string v3, "Surface Pregnancy Trimester 2 Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v144 .. v145}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v186, v3

    const-string v3, "Surface Pregnancy Trimester 3"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x2659b996

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v188, v3

    const-string v3, "Surface Pregnancy Trimester 3 Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v110 .. v111}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v190, v3

    const-string v3, "Surface Pregnancy Trimester 4"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v103 .. v103}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v192, v3

    const-string v3, "Surface Pregnancy Trimester 4 Dim"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xfff3f5f9L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v194, v3

    const-string v3, "Surface Secondary Grey"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xb2ffffffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v196, v3

    const-string v3, "Text Base Secondary"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v124 .. v125}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v124, v3

    const-string v3, "Text MCI Birth Control"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v130 .. v131}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v198, v3

    const-string v3, "Text MCI Follicular"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v134 .. v135}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v200, v3

    const-string v3, "Text MCI Luteal"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v97 .. v98}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v97, v3

    const-string v3, "Text MCI Menstrual"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v110 .. v111}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v202, v3

    const-string v3, "Text MCI Ovulatory"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v130 .. v131}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v130, v3

    const-string v3, "Text Pregnancy Trimester 1"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v134 .. v135}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v134, v3

    const-string v3, "Text Pregnancy Trimester 2"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v144 .. v145}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v144, v3

    const-string v3, "Text Pregnancy Trimester 3"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-static/range {v110 .. v111}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v110, v3

    const-string v3, "Text Pregnancy Trimester 4"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0xffffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v204, v3

    const-string v3, "Transparent"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x1affffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v206, v3

    const-string v3, "White 10"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x33ffffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v208, v3

    const-string v3, "White 20"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x4dffffff    # 5.3687088E8f

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v210, v3

    const-string v3, "White 30"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0x66ffffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v212, v3

    const-string v3, "White 40"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const v3, 0xdffffff

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v214, v3

    const-string v3, "White 5"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0x80ffffffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v216, v3

    const-string v3, "White 50"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xb3ffffffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v218, v3

    const-string v3, "White 70"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xe6ffffffL

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v220, v3

    const-string v3, "White 90"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    const-wide v3, 0xff5568c5L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    move-wide v5, v1

    new-instance v2, Li2/x;

    invoke-direct {v2, v3, v4}, Li2/x;-><init>(J)V

    move-wide v3, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-wide/from16 v222, v3

    const-string v3, "Withings Plan"

    const/4 v4, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v1, v2, Li2/x;->a:J

    invoke-virtual/range {p0 .. p0}, Lkd1/g;->c()Ljava/util/List;

    move-result-object v3

    move-wide/from16 v5, v218

    const/16 v219, 0x0

    move-wide/from16 v224, v110

    move-wide/from16 v110, v106

    move-wide/from16 v106, v120

    move-wide/from16 v120, v136

    move-wide/from16 v136, v154

    move-wide/from16 v154, v174

    move-wide/from16 v174, v194

    move-wide/from16 v194, v224

    move-wide/from16 v224, v178

    move-wide/from16 v178, v124

    move-wide/from16 v124, v140

    move-wide/from16 v140, v158

    move-wide/from16 v158, v224

    move-wide/from16 v224, v188

    move-wide/from16 v188, v130

    move-wide/from16 v130, v148

    move-wide/from16 v148, v168

    move-wide/from16 v168, v224

    move-object/from16 v218, v3

    move-wide/from16 v224, v1

    move-object v1, v0

    move-wide v2, v9

    move-wide/from16 v226, v216

    move-wide/from16 v216, v224

    move-wide/from16 v224, v210

    move-wide/from16 v210, v5

    move-wide v4, v13

    move-wide/from16 v228, v17

    move-wide/from16 v230, v19

    move-wide/from16 v18, v7

    move-wide v6, v15

    move-wide/from16 v8, v228

    move-wide/from16 v14, v23

    move-wide/from16 v16, v25

    move-wide/from16 v24, v35

    move-wide/from16 v228, v104

    move-wide/from16 v104, v11

    move-wide/from16 v10, v230

    move-wide/from16 v12, v21

    move-wide/from16 v20, v27

    move-wide/from16 v22, v31

    move-wide/from16 v26, v37

    move-wide/from16 v36, v47

    move-wide/from16 v230, v89

    move-wide/from16 v232, v91

    move-wide/from16 v90, v29

    move-wide/from16 v28, v39

    move-wide/from16 v30, v41

    move-wide/from16 v38, v49

    move-wide/from16 v40, v51

    move-wide/from16 v48, v59

    move-wide/from16 v50, v61

    move-wide/from16 v60, v71

    move-wide/from16 v234, v93

    move-wide/from16 v92, v33

    move-wide/from16 v32, v43

    move-wide/from16 v34, v45

    move-wide/from16 v42, v53

    move-wide/from16 v44, v55

    move-wide/from16 v46, v57

    move-wide/from16 v52, v63

    move-wide/from16 v54, v65

    move-wide/from16 v56, v67

    move-wide/from16 v58, v69

    move-wide/from16 v62, v73

    move-wide/from16 v64, v77

    move-wide/from16 v66, v79

    move-wide/from16 v68, v81

    move-wide/from16 v70, v83

    move-wide/from16 v72, v85

    move-wide/from16 v78, v232

    move-wide/from16 v80, v234

    move-wide/from16 v82, v95

    move-wide/from16 v84, v99

    move-wide/from16 v94, v108

    move-wide/from16 v108, v122

    move-wide/from16 v122, v138

    move-wide/from16 v138, v156

    move-wide/from16 v156, v176

    move-wide/from16 v176, v196

    move-wide/from16 v196, v204

    move-wide/from16 v204, v212

    move-wide/from16 v212, v220

    move-wide/from16 v232, v114

    move-wide/from16 v114, v75

    move-wide/from16 v74, v87

    move-wide/from16 v76, v230

    move-wide/from16 v86, v101

    move-wide/from16 v88, v228

    move-wide/from16 v100, v116

    move-wide/from16 v102, v118

    move-wide/from16 v116, v128

    move-wide/from16 v118, v132

    move-wide/from16 v128, v146

    move-wide/from16 v132, v150

    move-wide/from16 v146, v165

    move-wide/from16 v150, v170

    move-wide/from16 v166, v186

    move-wide/from16 v170, v190

    move-wide/from16 v186, v202

    move-wide/from16 v202, v224

    move-wide/from16 v190, v134

    move-wide/from16 v134, v152

    move-wide/from16 v152, v172

    move-wide/from16 v172, v192

    move-wide/from16 v192, v144

    move-wide/from16 v144, v163

    move-wide/from16 v162, v182

    move-wide/from16 v164, v184

    move-wide/from16 v182, v200

    move-wide/from16 v200, v208

    move-wide/from16 v208, v226

    move-wide/from16 v184, v97

    move-wide/from16 v96, v112

    move-wide/from16 v98, v232

    move-wide/from16 v112, v126

    move-wide/from16 v126, v142

    move-wide/from16 v142, v160

    move-wide/from16 v160, v180

    move-wide/from16 v180, v198

    move-wide/from16 v198, v206

    move-wide/from16 v206, v214

    move-wide/from16 v214, v222

    invoke-direct/range {v1 .. v219}, Ly81/i;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final c()Ly81/i;
    .locals 1

    sget-object v0, Ly81/j;->a:Ly81/i;

    return-object v0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;)Ly81/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ly81/i;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd1/g;

    invoke-direct {v0}, Lkd1/g;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly81/i;

    return-object p0
.end method
