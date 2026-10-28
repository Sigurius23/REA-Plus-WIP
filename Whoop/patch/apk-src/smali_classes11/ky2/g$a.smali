.class public abstract Lky2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lky2/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lky2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lky2/g$a$a;,
        Lky2/g$a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0002\u0012\u000fBE\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0015R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0008\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0016\u0010\u001dR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0012\u0010 \u0082\u0001\u0002!\"\u00a8\u0006#"
    }
    d2 = {
        "Lky2/g$a;",
        "Lky2/g;",
        "",
        "questionId",
        "Lcom/whoop/design/util/TextResource;",
        "toolbarTitle",
        "toolbarSubTitle",
        "",
        "isPositiveButtonEnabled",
        "Lky2/l;",
        "submitting",
        "Lky2/k;",
        "submitted",
        "<init>",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;)V",
        "a",
        "I",
        "()I",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "getToolbarTitle",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "getToolbarSubTitle",
        "d",
        "Z",
        "()Z",
        "e",
        "Lky2/l;",
        "()Lky2/l;",
        "f",
        "Lky2/k;",
        "()Lky2/k;",
        "Lky2/g$a$a;",
        "Lky2/g$a$b;",
        "whooplabs_release"
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
.field public static final g:I


# instance fields
.field private final a:I

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Z

.field private final e:Lky2/l;

.field private final f:Lky2/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    sput v0, Lky2/g$a;->g:I

    return-void
.end method

.method private constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lky2/g$a;->a:I

    .line 4
    iput-object p2, p0, Lky2/g$a;->b:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lky2/g$a;->c:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-boolean p4, p0, Lky2/g$a;->d:Z

    .line 7
    iput-object p5, p0, Lky2/g$a;->e:Lky2/l;

    .line 8
    iput-object p6, p0, Lky2/g$a;->f:Lky2/k;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lky2/g$a;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;)V

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Lky2/k;
.end method

.method public abstract c()Lky2/l;
.end method
