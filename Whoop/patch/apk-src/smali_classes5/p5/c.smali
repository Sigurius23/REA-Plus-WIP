.class public final Lp5/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Landroid/os/CancellationSignal;

.field public final synthetic x:Ljava/util/concurrent/Executor;

.field public final synthetic y:Lm5/g;


# direct methods
.method public constructor <init>(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 0

    iput-object p1, p0, Lp5/c;->w:Landroid/os/CancellationSignal;

    iput-object p2, p0, Lp5/c;->x:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lp5/c;->y:Lm5/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Ljava/lang/Void;

    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    new-instance v0, La3/z0;

    iget-object v1, p0, Lp5/c;->y:Lm5/g;

    const/16 v2, 0x17

    iget-object v3, p0, Lp5/c;->x:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v2, v3, v1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lp5/c;->w:Landroid/os/CancellationSignal;

    invoke-static {p1}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, La3/z0;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
