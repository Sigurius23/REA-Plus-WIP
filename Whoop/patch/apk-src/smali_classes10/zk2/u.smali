.class public final synthetic Lzk2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzk2/u;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzk2/u;->w:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lzk2/v;->e(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
