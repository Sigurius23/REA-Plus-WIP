.class final Lyr2/b$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyr2/b;->b(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.util.splashvideo.SplashVideoHelperImpl"
    f = "SplashVideoHelperImpl.kt"
    l = {
        0x3d
    }
    m = "recordIsFirstAppLaunch"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lyr2/b;

.field y:I


# direct methods
.method public constructor <init>(Lyr2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyr2/b;",
            "Lq83/d<",
            "-",
            "Lyr2/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyr2/b$b;->x:Lyr2/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyr2/b$b;->w:Ljava/lang/Object;

    iget p1, p0, Lyr2/b$b;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyr2/b$b;->y:I

    iget-object p1, p0, Lyr2/b$b;->x:Lyr2/b;

    invoke-virtual {p1, p0}, Lyr2/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
