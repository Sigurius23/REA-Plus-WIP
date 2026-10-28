.class public final Lx43/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Lec3/f2;


# direct methods
.method public constructor <init>(Lec3/f2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx43/a;->a:I

    const-string v0, "streamVideo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx43/a;->b:Lec3/f2;

    return-void
.end method

.method public constructor <init>(Lec3/h2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx43/a;->a:I

    const-string v0, "currentStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx43/a;->b:Lec3/f2;

    return-void
.end method
