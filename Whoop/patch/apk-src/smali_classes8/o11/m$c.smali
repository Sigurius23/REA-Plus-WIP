.class public abstract Lo11/m$c;
.super Lo11/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo11/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo11/m$c$a;,
        Lo11/m$c$b;,
        Lo11/m$c$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u0082\u0001\u0003 !\"\u00a8\u0006#"
    }
    d2 = {
        "Lo11/m$c;",
        "Lo11/m;",
        "<init>",
        "()V",
        "Lkd1/o$c;",
        "s",
        "Ll83/h;",
        "C",
        "()Lkd1/o$c;",
        "image",
        "Ly81/f;",
        "t",
        "Ly81/f;",
        "A",
        "()Ly81/f;",
        "endIconColor",
        "u",
        "B",
        "endIconPressedColor",
        "Li3/i;",
        "v",
        "I",
        "E",
        "()I",
        "role",
        "",
        "D",
        "()Ljava/lang/String;",
        "imageUrl",
        "c",
        "a",
        "b",
        "Lo11/m$c$a;",
        "Lo11/m$c$b;",
        "Lo11/m$c$c;",
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


# static fields
.field public static final w:I = 0x8


# instance fields
.field private final s:Ll83/h;

.field private final t:Ly81/f;

.field private final u:Ly81/f;

.field private final v:I


# direct methods
.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lo11/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    new-instance v0, Lnr0/e;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lo11/m$c;->s:Ll83/h;

    .line 4
    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    iput-object v0, p0, Lo11/m$c;->t:Ly81/f;

    .line 5
    sget-object v0, Ly81/f;->BRAND_BLACK:Ly81/f;

    iput-object v0, p0, Lo11/m$c;->u:Ly81/f;

    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lo11/m$c;->v:I

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lo11/m$c;-><init>()V

    return-void
.end method

.method private static final F(Lo11/m$c;)Lkd1/o$c;
    .locals 1

    invoke-virtual {p0}, Lo11/m$c;->D()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo11/m;->y(Ljava/lang/String;)Lkd1/o$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lo11/m$c;)Lkd1/o$c;
    .locals 0

    invoke-static {p0}, Lo11/m$c;->F(Lo11/m$c;)Lkd1/o$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A()Ly81/f;
    .locals 1

    iget-object v0, p0, Lo11/m$c;->t:Ly81/f;

    return-object v0
.end method

.method public B()Ly81/f;
    .locals 1

    iget-object v0, p0, Lo11/m$c;->u:Ly81/f;

    return-object v0
.end method

.method public C()Lkd1/o$c;
    .locals 1

    iget-object v0, p0, Lo11/m$c;->s:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkd1/o$c;

    return-object v0
.end method

.method public abstract D()Ljava/lang/String;
.end method

.method public E()I
    .locals 1

    iget v0, p0, Lo11/m$c;->v:I

    return v0
.end method

.method public bridge synthetic j()Lkd1/o;
    .locals 1

    invoke-virtual {p0}, Lo11/m$c;->C()Lkd1/o$c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic o()Li3/i;
    .locals 2

    invoke-virtual {p0}, Lo11/m$c;->E()I

    move-result v0

    new-instance v1, Li3/i;

    invoke-direct {v1, v0}, Li3/i;-><init>(I)V

    return-object v1
.end method
