.class public final Lrc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic E:Landroidx/lifecycle/t0;

.field public w:Ljava/lang/Object;

.field public final synthetic x:Lsc/a;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lv/a;


# direct methods
.method public constructor <init>(Lsc/a;Ljava/lang/Object;Lv/a;Landroidx/lifecycle/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/c;->x:Lsc/a;

    iput-object p2, p0, Lrc/c;->y:Ljava/lang/Object;

    iput-object p3, p0, Lrc/c;->z:Lv/a;

    iput-object p4, p0, Lrc/c;->E:Landroidx/lifecycle/t0;

    const/4 p1, 0x0

    iput-object p1, p0, Lrc/c;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Lcq/m;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0, p1}, Lcq/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lrc/c;->x:Lsc/a;

    invoke-interface {p1, v0}, Lsc/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method
