.class public final synthetic Lsy2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Lty2/a$a$b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lty2/a$a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy2/d;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lsy2/d;->x:Lty2/a$a$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lsy2/d;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsy2/d;->x:Lty2/a$a$b;

    invoke-static {v0, v1, p1, p2}, Lsy2/e;->h(Lkotlin/jvm/functions/Function1;Lty2/a$a$b;II)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
