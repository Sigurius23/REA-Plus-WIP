.class public final Ll3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/Html$TagHandler;


# virtual methods
.method public final handleTag(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V
    .locals 0

    if-eqz p4, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const-string p1, "ContentHandlerReplacementTag"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p4}, Lorg/xml/sax/XMLReader;->getContentHandler()Lorg/xml/sax/ContentHandler;

    move-result-object p1

    new-instance p2, Ll3/i;

    invoke-direct {p2, p1, p3}, Ll3/i;-><init>(Lorg/xml/sax/ContentHandler;Landroid/text/Editable;)V

    invoke-interface {p4, p2}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    :cond_1
    :goto_0
    return-void
.end method
