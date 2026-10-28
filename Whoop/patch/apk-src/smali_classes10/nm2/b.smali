.class public final synthetic Lnm2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lnm2/c;

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(Lnm2/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm2/b;->w:Lnm2/c;

    iput-boolean p2, p0, Lnm2/b;->x:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Lnm2/b;->x:Z

    check-cast p1, Lnm2/d;

    iget-object v1, p0, Lnm2/b;->w:Lnm2/c;

    invoke-static {v1, v0, p1}, Lnm2/c$a;->f(Lnm2/c;ZLnm2/d;)Lnm2/d;

    move-result-object p1

    return-object p1
.end method
