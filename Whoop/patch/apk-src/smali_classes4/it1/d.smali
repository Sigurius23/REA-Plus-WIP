.class public final Lit1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lit1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lit1/d;",
        "",
        "<init>",
        "()V",
        "Lht1/e;",
        "selectedWrist",
        "",
        "willOverwriteReading",
        "Lit1/c;",
        "c",
        "(Lht1/e;Z)Lit1/c;",
        "Lec3/l;",
        "Lht1/b;",
        "domainResult",
        "b",
        "(Lec3/l;)Lec3/l;",
        "labrador_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lit1/d;Lht1/e;Z)Lit1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lit1/d;->c(Lht1/e;Z)Lit1/c;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lht1/e;Z)Lit1/c;
    .locals 18

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lit1/d$a;->a:[I

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_0
    if-eq v1, v0, :cond_3

    const/4 v0, 0x1

    if-eq v1, v0, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    sget-object v0, Lit1/c$b;->o:Lit1/c$b$a;

    invoke-virtual {v0}, Lit1/c$b$a;->c()Lit1/c$b;

    move-result-object v0

    :goto_1
    move-object v1, v0

    goto :goto_2

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    sget-object v0, Lit1/c$b;->o:Lit1/c$b$a;

    invoke-virtual {v0}, Lit1/c$b$a;->b()Lit1/c$b;

    move-result-object v0

    goto :goto_1

    :cond_3
    sget-object v0, Lit1/c$b;->o:Lit1/c$b$a;

    invoke-virtual {v0}, Lit1/c$b$a;->a()Lit1/c$b;

    move-result-object v0

    goto :goto_1

    :goto_2
    const/16 v16, 0x1fff

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v15, p2

    invoke-static/range {v1 .. v17}, Lit1/c$b;->e(Lit1/c$b;Lht1/e;IILcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lit1/c$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lit1/d$b;

    invoke-direct {v0, p1, p0}, Lit1/d$b;-><init>(Lec3/l;Lit1/d;)V

    return-object v0
.end method
