.class final Lg32/o$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg32/o$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u0005\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lg32/o$a$a;",
        "",
        "<init>",
        "()V",
        "Lh20/v1;",
        "b",
        "Lh20/v1;",
        "a",
        "()Lh20/v1;",
        "FLOW_CONTROLLER_COLORS",
        "Lh20/z2;",
        "c",
        "Lh20/z2;",
        "()Lh20/z2;",
        "FLOW_CONTROLLER_PRIMARY_BUTTON_COLORS",
        "payments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lg32/o$a$a;

.field private static final b:Lh20/v1;

.field private static final c:Lh20/z2;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lg32/o$a$a;

    invoke-direct {v0}, Lg32/o$a$a;-><init>()V

    sput-object v0, Lg32/o$a$a;->a:Lg32/o$a$a;

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v3

    const-wide v0, 0xff1b2328L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v4

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v5

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->V0()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v6

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v7

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v8

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v10

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v11

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v9

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v12

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v13

    new-instance v2, Lh20/v1;

    invoke-direct/range {v2 .. v13}, Lh20/v1;-><init>(IIIIIIIIIII)V

    sput-object v2, Lg32/o$a$a;->b:Lh20/v1;

    new-instance v3, Lh20/z2;

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v5

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->V0()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v6

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v7

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v8

    invoke-direct/range {v3 .. v8}, Lh20/z2;-><init>(Ljava/lang/Integer;IIII)V

    sput-object v3, Lg32/o$a$a;->c:Lh20/z2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lh20/v1;
    .locals 1

    sget-object v0, Lg32/o$a$a;->b:Lh20/v1;

    return-object v0
.end method

.method public final b()Lh20/z2;
    .locals 1

    sget-object v0, Lg32/o$a$a;->c:Lh20/z2;

    return-object v0
.end method
