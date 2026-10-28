.class public final Ljx1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0000\n\u0002\u00080\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00cf\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0084\u0002\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00152\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00152\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010\"\u001a\u00020!2\u0008\u0008\u0002\u0010#\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020\u00152\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u00100\u001a\u0004\u00081\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00100\u001a\u0004\u00083\u0010)R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00100\u001a\u0004\u00085\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00086\u00100\u001a\u0004\u00087\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00088\u00100\u001a\u0004\u00089\u0010)R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u00100\u001a\u0004\u0008?\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u00100\u001a\u0004\u0008@\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010A\u001a\u0004\u0008B\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u00087\u0010D\u001a\u0004\u0008E\u0010+R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010F\u001a\u0004\u0008G\u0010HR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010F\u001a\u0004\u0008J\u0010HR\u0017\u0010\u0014\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u00100\u001a\u0004\u0008I\u0010)R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010L\u001a\u0004\u0008M\u0010NR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u0010O\u001a\u0004\u0008K\u0010PR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u00085\u0010Q\u001a\u0004\u00088\u0010RR\u0017\u0010\u001b\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010L\u001a\u0004\u00084\u0010NR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008J\u0010S\u001a\u0004\u0008>\u0010TR\u0017\u0010\u001e\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008U\u0010L\u001a\u0004\u0008U\u0010NR\u0017\u0010 \u001a\u00020\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008V\u0010XR\u0017\u0010\"\u001a\u00020!8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010Y\u001a\u0004\u0008:\u0010ZR\u0017\u0010#\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u00100\u001a\u0004\u0008[\u0010)\u00a8\u0006\\"
    }
    d2 = {
        "Ljx1/s;",
        "Lm91/u;",
        "",
        "title",
        "subtitle",
        "price",
        "expandedPrice",
        "expandedSubtitle",
        "",
        "Ljx1/c;",
        "summaryItems",
        "expandTitle",
        "expandText",
        "Ljx1/d;",
        "paymentOptions",
        "",
        "paymentOptionSelected",
        "Ljx1/g;",
        "primaryCta",
        "secondaryCta",
        "footerText",
        "",
        "isExpanded",
        "Lq22/e;",
        "formValidator",
        "Lcom/whoop/payments/domain/models/Card;",
        "card",
        "buttonEnabled",
        "Ljx1/f;",
        "confirmModal",
        "showConfirmModal",
        "Ljx1/t;",
        "style",
        "Ljx1/u;",
        "checkoutType",
        "trackingMonths",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)V",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)Ljx1/s;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "w",
        "b",
        "u",
        "c",
        "p",
        "d",
        "j",
        "e",
        "k",
        "f",
        "Ljava/util/List;",
        "v",
        "()Ljava/util/List;",
        "g",
        "i",
        "h",
        "Ljx1/d;",
        "o",
        "()Ljx1/d;",
        "I",
        "n",
        "Ljx1/g;",
        "q",
        "()Ljx1/g;",
        "l",
        "r",
        "m",
        "Z",
        "y",
        "()Z",
        "Lq22/e;",
        "()Lq22/e;",
        "Lcom/whoop/payments/domain/models/Card;",
        "()Lcom/whoop/payments/domain/models/Card;",
        "Ljx1/f;",
        "()Ljx1/f;",
        "s",
        "t",
        "Ljx1/t;",
        "()Ljx1/t;",
        "Ljx1/u;",
        "()Ljx1/u;",
        "x",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljx1/c;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljx1/d;

.field private final j:I

.field private final k:Ljx1/g;

.field private final l:Ljx1/g;

.field private final m:Ljava/lang/String;

.field private final n:Z

.field private final o:Lq22/e;

.field private final p:Lcom/whoop/payments/domain/models/Card;

.field private final q:Z

.field private final r:Ljx1/f;

.field private final s:Z

.field private final t:Ljx1/t;

.field private final u:Ljx1/u;

.field private final v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljx1/c;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljx1/d;",
            "I",
            "Ljx1/g;",
            "Ljx1/g;",
            "Ljava/lang/String;",
            "Z",
            "Lq22/e;",
            "Lcom/whoop/payments/domain/models/Card;",
            "Z",
            "Ljx1/f;",
            "Z",
            "Ljx1/t;",
            "Ljx1/u;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p11

    move-object/from16 v1, p13

    move-object/from16 v2, p20

    move-object/from16 v3, p21

    move-object/from16 v4, p22

    const-string v5, "title"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "subtitle"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "price"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "summaryItems"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "primaryCta"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "footerText"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "style"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "checkoutType"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "trackingMonths"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljx1/s;->a:Ljava/lang/String;

    iput-object p2, p0, Ljx1/s;->b:Ljava/lang/String;

    iput-object p3, p0, Ljx1/s;->c:Ljava/lang/String;

    iput-object p4, p0, Ljx1/s;->d:Ljava/lang/String;

    iput-object p5, p0, Ljx1/s;->e:Ljava/lang/String;

    iput-object p6, p0, Ljx1/s;->f:Ljava/util/List;

    iput-object p7, p0, Ljx1/s;->g:Ljava/lang/String;

    iput-object p8, p0, Ljx1/s;->h:Ljava/lang/String;

    iput-object p9, p0, Ljx1/s;->i:Ljx1/d;

    move/from16 p1, p10

    iput p1, p0, Ljx1/s;->j:I

    iput-object v0, p0, Ljx1/s;->k:Ljx1/g;

    move-object/from16 p1, p12

    iput-object p1, p0, Ljx1/s;->l:Ljx1/g;

    iput-object v1, p0, Ljx1/s;->m:Ljava/lang/String;

    move/from16 p1, p14

    iput-boolean p1, p0, Ljx1/s;->n:Z

    move-object/from16 p1, p15

    iput-object p1, p0, Ljx1/s;->o:Lq22/e;

    move-object/from16 p1, p16

    iput-object p1, p0, Ljx1/s;->p:Lcom/whoop/payments/domain/models/Card;

    move/from16 p1, p17

    iput-boolean p1, p0, Ljx1/s;->q:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Ljx1/s;->r:Ljx1/f;

    move/from16 p1, p19

    iput-boolean p1, p0, Ljx1/s;->s:Z

    iput-object v2, p0, Ljx1/s;->t:Ljx1/t;

    iput-object v3, p0, Ljx1/s;->u:Ljx1/u;

    iput-object v4, p0, Ljx1/s;->v:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b(Ljx1/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;ILjava/lang/Object;)Ljx1/s;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Ljx1/s;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Ljx1/s;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Ljx1/s;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Ljx1/s;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Ljx1/s;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Ljx1/s;->f:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Ljx1/s;->g:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Ljx1/s;->h:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Ljx1/s;->i:Ljx1/d;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Ljx1/s;->j:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Ljx1/s;->k:Ljx1/g;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Ljx1/s;->l:Ljx1/g;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Ljx1/s;->m:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Ljx1/s;->n:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Ljx1/s;->o:Lq22/e;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Ljx1/s;->p:Lcom/whoop/payments/domain/models/Card;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p23, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Ljx1/s;->q:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p23, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Ljx1/s;->r:Ljx1/f;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p23, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-boolean v1, v0, Ljx1/s;->s:Z

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p23, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Ljx1/s;->t:Ljx1/t;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p23, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Ljx1/s;->u:Ljx1/u;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p23, v16

    if-eqz v16, :cond_15

    move-object/from16 p7, v1

    iget-object v1, v0, Ljx1/s;->v:Ljava/lang/String;

    move-object/from16 p22, p7

    move-object/from16 p23, v1

    :goto_15
    move-object/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    move-object/from16 p22, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p23}, Ljx1/s;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)Ljx1/s;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)Ljx1/s;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljx1/c;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljx1/d;",
            "I",
            "Ljx1/g;",
            "Ljx1/g;",
            "Ljava/lang/String;",
            "Z",
            "Lq22/e;",
            "Lcom/whoop/payments/domain/models/Card;",
            "Z",
            "Ljx1/f;",
            "Z",
            "Ljx1/t;",
            "Ljx1/u;",
            "Ljava/lang/String;",
            ")",
            "Ljx1/s;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summaryItems"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryCta"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerText"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkoutType"

    move-object/from16 v5, p21

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingMonths"

    move-object/from16 v6, p22

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljx1/s;

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v23}, Ljx1/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljx1/d;ILjx1/g;Ljx1/g;Ljava/lang/String;ZLq22/e;Lcom/whoop/payments/domain/models/Card;ZLjx1/f;ZLjx1/t;Ljx1/u;Ljava/lang/String;)V

    return-object v1
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ljx1/s;->q:Z

    return v0
.end method

.method public final e()Lcom/whoop/payments/domain/models/Card;
    .locals 1

    iget-object v0, p0, Ljx1/s;->p:Lcom/whoop/payments/domain/models/Card;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljx1/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljx1/s;

    iget-object v1, p0, Ljx1/s;->a:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ljx1/s;->b:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ljx1/s;->c:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ljx1/s;->d:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ljx1/s;->e:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ljx1/s;->f:Ljava/util/List;

    iget-object v3, p1, Ljx1/s;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ljx1/s;->g:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ljx1/s;->h:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ljx1/s;->i:Ljx1/d;

    iget-object v3, p1, Ljx1/s;->i:Ljx1/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Ljx1/s;->j:I

    iget v3, p1, Ljx1/s;->j:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ljx1/s;->k:Ljx1/g;

    iget-object v3, p1, Ljx1/s;->k:Ljx1/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ljx1/s;->l:Ljx1/g;

    iget-object v3, p1, Ljx1/s;->l:Ljx1/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Ljx1/s;->m:Ljava/lang/String;

    iget-object v3, p1, Ljx1/s;->m:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Ljx1/s;->n:Z

    iget-boolean v3, p1, Ljx1/s;->n:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Ljx1/s;->o:Lq22/e;

    iget-object v3, p1, Ljx1/s;->o:Lq22/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Ljx1/s;->p:Lcom/whoop/payments/domain/models/Card;

    iget-object v3, p1, Ljx1/s;->p:Lcom/whoop/payments/domain/models/Card;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Ljx1/s;->q:Z

    iget-boolean v3, p1, Ljx1/s;->q:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Ljx1/s;->r:Ljx1/f;

    iget-object v3, p1, Ljx1/s;->r:Ljx1/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Ljx1/s;->s:Z

    iget-boolean v3, p1, Ljx1/s;->s:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Ljx1/s;->t:Ljx1/t;

    iget-object v3, p1, Ljx1/s;->t:Ljx1/t;

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Ljx1/s;->u:Ljx1/u;

    iget-object v3, p1, Ljx1/s;->u:Ljx1/u;

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Ljx1/s;->v:Ljava/lang/String;

    iget-object p1, p1, Ljx1/s;->v:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final f()Ljx1/u;
    .locals 1

    iget-object v0, p0, Ljx1/s;->u:Ljx1/u;

    return-object v0
.end method

.method public final g()Ljx1/f;
    .locals 1

    iget-object v0, p0, Ljx1/s;->r:Ljx1/f;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->h:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ljx1/s;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/s;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ljx1/s;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ljx1/s;->d:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/s;->e:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/s;->f:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Ljx1/s;->g:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/s;->h:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/s;->i:Ljx1/d;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljx1/d;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ljx1/s;->j:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Ljx1/s;->k:Ljx1/g;

    invoke-virtual {v2}, Ljx1/g;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ljx1/s;->l:Ljx1/g;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljx1/g;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ljx1/s;->m:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Ljx1/s;->n:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ljx1/s;->o:Lq22/e;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/s;->p:Lcom/whoop/payments/domain/models/Card;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/payments/domain/models/Card;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ljx1/s;->q:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ljx1/s;->r:Ljx1/f;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljx1/f;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ljx1/s;->s:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ljx1/s;->t:Ljx1/t;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ljx1/s;->u:Ljx1/u;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ljx1/s;->v:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final m()Lq22/e;
    .locals 1

    iget-object v0, p0, Ljx1/s;->o:Lq22/e;

    return-object v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Ljx1/s;->j:I

    return v0
.end method

.method public final o()Ljx1/d;
    .locals 1

    iget-object v0, p0, Ljx1/s;->i:Ljx1/d;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Ljx1/g;
    .locals 1

    iget-object v0, p0, Ljx1/s;->k:Ljx1/g;

    return-object v0
.end method

.method public final r()Ljx1/g;
    .locals 1

    iget-object v0, p0, Ljx1/s;->l:Ljx1/g;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Ljx1/s;->s:Z

    return v0
.end method

.method public final t()Ljx1/t;
    .locals 1

    iget-object v0, p0, Ljx1/s;->t:Ljx1/t;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Ljx1/s;->a:Ljava/lang/String;

    iget-object v2, v0, Ljx1/s;->b:Ljava/lang/String;

    iget-object v3, v0, Ljx1/s;->c:Ljava/lang/String;

    iget-object v4, v0, Ljx1/s;->d:Ljava/lang/String;

    iget-object v5, v0, Ljx1/s;->e:Ljava/lang/String;

    iget-object v6, v0, Ljx1/s;->f:Ljava/util/List;

    iget-object v7, v0, Ljx1/s;->g:Ljava/lang/String;

    iget-object v8, v0, Ljx1/s;->h:Ljava/lang/String;

    iget-object v9, v0, Ljx1/s;->i:Ljx1/d;

    iget v10, v0, Ljx1/s;->j:I

    iget-object v11, v0, Ljx1/s;->k:Ljx1/g;

    iget-object v12, v0, Ljx1/s;->l:Ljx1/g;

    iget-object v13, v0, Ljx1/s;->m:Ljava/lang/String;

    iget-boolean v14, v0, Ljx1/s;->n:Z

    iget-object v15, v0, Ljx1/s;->o:Lq22/e;

    move-object/from16 v16, v15

    iget-object v15, v0, Ljx1/s;->p:Lcom/whoop/payments/domain/models/Card;

    move-object/from16 v17, v15

    iget-boolean v15, v0, Ljx1/s;->q:Z

    move/from16 v18, v15

    iget-object v15, v0, Ljx1/s;->r:Ljx1/f;

    move-object/from16 v19, v15

    iget-boolean v15, v0, Ljx1/s;->s:Z

    move/from16 v20, v15

    iget-object v15, v0, Ljx1/s;->t:Ljx1/t;

    move-object/from16 v21, v15

    iget-object v15, v0, Ljx1/s;->u:Ljx1/u;

    move-object/from16 v22, v15

    iget-object v15, v0, Ljx1/s;->v:Ljava/lang/String;

    const-string v0, ", subtitle="

    move-object/from16 v23, v15

    const-string v15, ", price="

    move-object/from16 v24, v13

    const-string v13, "MembershipCheckoutCardViewState(title="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expandedPrice="

    const-string v2, ", expandedSubtitle="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", summaryItems="

    const-string v2, ", expandTitle="

    invoke-static {v5, v1, v2, v0, v6}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", expandText="

    const-string v2, ", paymentOptions="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentOptionSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", primaryCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isExpanded="

    const-string v2, ", formValidator="

    move-object/from16 v3, v24

    invoke-static {v0, v3, v1, v14, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", card="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", confirmModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showConfirmModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", checkoutType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackingMonths="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljx1/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljx1/s;->f:Ljava/util/List;

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final x()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/s;->v:Ljava/lang/String;

    return-object v0
.end method

.method public final y()Z
    .locals 1

    iget-boolean v0, p0, Ljx1/s;->n:Z

    return v0
.end method
