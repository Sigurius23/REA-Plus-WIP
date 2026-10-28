.class public abstract Lo11/m$d;
.super Lo11/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo11/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo11/m$d$a;,
        Lo11/m$d$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000e\u0082\u0001\u0002\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lo11/m$d;",
        "Lo11/m;",
        "<init>",
        "()V",
        "",
        "s",
        "Z",
        "v",
        "()Z",
        "isExpanded",
        "Ly81/f;",
        "t",
        "Ly81/f;",
        "z",
        "()Ly81/f;",
        "endIconColor",
        "u",
        "A",
        "endIconPressedColor",
        "a",
        "b",
        "Lo11/m$d$a;",
        "Lo11/m$d$b;",
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
.field public static final v:I = 0x8


# instance fields
.field private final s:Z

.field private final t:Ly81/f;

.field private final u:Ly81/f;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lo11/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lo11/m$d;->s:Z

    .line 4
    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    iput-object v0, p0, Lo11/m$d;->t:Ly81/f;

    .line 5
    sget-object v0, Ly81/f;->BRAND_BLACK:Ly81/f;

    iput-object v0, p0, Lo11/m$d;->u:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lo11/m$d;-><init>()V

    return-void
.end method


# virtual methods
.method public A()Ly81/f;
    .locals 1

    iget-object v0, p0, Lo11/m$d;->u:Ly81/f;

    return-object v0
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, Lo11/m$d;->s:Z

    return v0
.end method

.method public z()Ly81/f;
    .locals 1

    iget-object v0, p0, Lo11/m$d;->t:Ly81/f;

    return-object v0
.end method
